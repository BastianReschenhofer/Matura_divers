## Einfache

### 1. Mitarbeiter und ihre Büros
**Aufgabe:** Liste alle Mitarbeiter (Vor- und Nachname) mit der Stadt auf, in der sie arbeiten.

```sql
SELECT e.lastName, e.firstName, o.city 
FROM employees e
LEFT JOIN offices o USING(officeCode);
```

### 2. Kunden ohne Bestellungen
**Aufgabe:** Finde alle Kunden, die noch nie eine Bestellung getätigt haben.

```sql
SELECT c.customerName 
FROM customers c
LEFT JOIN orders o USING(customerNumber)
WHERE o.orderNumber IS NULL;
```

### 3. Umsatz pro Produktlinie
**Aufgabe:** Berechne den Gesamtumsatz (`priceEach * quantityOrdered`) für jede Produktlinie.

```sql
SELECT pl.productLine, SUM(od.priceEach * od.quantityOrdered) AS Umsatz 
FROM productlines pl
LEFT JOIN products p USING(productLine)
LEFT JOIN orderdetails od USING(productCode)
GROUP BY pl.productLine;
```

### 4. Bestellungen aus dem Jahr 2004
**Aufgabe:** Liste alle Bestellnummern und deren Datum auf, die im Jahr 2004 getätigt wurden.

```sql
SELECT orderNumber, orderDate 
FROM orders
WHERE YEAR(orderDate) = 2004;
```

### 5. Produkte mit hohem Lagerbestand
**Aufgabe:** Zeige alle Produkte (Name und Bestand), deren Lagerbestand größer als 5.000 Stück ist, absteigend sortiert nach Bestand.

```sql
SELECT productName, quantityInStock 
FROM products
WHERE quantityInStock > 5000
ORDER BY quantityInStock DESC;
```

***

## Mittel

### 6. Umsatz pro Verkäufer (Sales Rep)
**Aufgabe:** Berechne den generierten Umsatz (nicht die Zahlungen) pro Mitarbeiter. Zeige auch Mitarbeiter, die keinen Umsatz gemacht haben (mit `0`).
*(Hinweis: Umsatz wird aus den Orderdetails berechnet. COALESCE verhindert NULL-Werte bei Mitarbeitern ohne Umsatz).*

```sql
SELECT e.lastName, e.firstName, 
       COALESCE(SUM(od.quantityOrdered * od.priceEach), 0) AS Umsatz 
FROM employees e
LEFT JOIN customers c ON c.salesRepEmployeeNumber = e.employeeNumber
LEFT JOIN orders o USING(customerNumber)
LEFT JOIN orderdetails od USING(orderNumber)
WHERE e.jobTitle = 'Sales Rep'
GROUP BY e.employeeNumber
ORDER BY Umsatz DESC;
```

### 7. Büros mit hohem Umsatz
**Aufgabe:** Liste alle Büros (Stadt) auf, deren betreute Kunden zusammen mehr als 200.000$ Umsatz generiert haben.

```sql
SELECT of.city, SUM(od.priceEach * od.quantityOrdered) AS GesamtUmsatz 
FROM offices of
JOIN employees e USING(officeCode)
JOIN customers c ON c.salesRepEmployeeNumber = e.employeeNumber
JOIN orders o USING(customerNumber)
JOIN orderdetails od USING(orderNumber)
GROUP BY of.officeCode
HAVING GesamtUmsatz > 200000
ORDER BY GesamtUmsatz DESC;
```

### 8. Gewinn pro Produkt
**Aufgabe:** Berechne den Gesamtgewinn `(priceEach - buyPrice) * quantityOrdered` für jedes Produkt.

```sql
SELECT p.productName, p.productCode, 
       SUM((od.priceEach - p.buyPrice) * od.quantityOrdered) AS Gewinn 
FROM products p
LEFT JOIN orderdetails od USING(productCode)
GROUP BY p.productCode
ORDER BY Gewinn DESC;
```

### 9. Durchschnittliche Lieferzeit pro Land
**Aufgabe:** Berechne die durchschnittlichen Tage zwischen Bestelldatum (`orderDate`) und Versanddatum (`shippedDate`) für jedes Land.

```sql
SELECT c.country, 
       ROUND(AVG(DATEDIFF(o.shippedDate, o.orderDate)), 1) AS AvgLieferTage
FROM customers c
JOIN orders o USING(customerNumber)
WHERE o.shippedDate IS NOT NULL
GROUP BY c.country
ORDER BY AvgLieferTage DESC;
```

### 10. Produkte, die nie verkauft wurden
**Aufgabe:** Finde alle Produkte, die nicht in der `orderdetails`-Tabelle auftauchen.

```sql
SELECT productName 
FROM products
WHERE productCode NOT IN (SELECT DISTINCT productCode FROM orderdetails);
```


## Schwierig


### 11. Offener Betrag pro Kunde (Der Endgegner)
**Aufgabe:** Berechne für jeden Kunden den Gesamtbestellwert, den insgesamt bezahlten Betrag und die Differenz (den offenen Betrag). Sortiere das Ergebnis nach dem offenen Betrag absteigend.


### 12. Der umsatzstärkste Kunde pro Land
**Aufgabe:** Zeige für jedes Land genau den einen Kunden an, der (über alle seine Bestellungen hinweg) den höchsten Gesamtumsatz generiert hat.


### 13. Manager-Hierarchie (3 Ebenen)
**Aufgabe:** Erstelle eine Liste mit drei Spalten: Den vollen Namen des Mitarbeiters, den Namen seines direkten Vorgesetzten und den Namen des Chefs seines Vorgesetzten.


### 14. Kunden unter dem Durchschnitts-Kreditlimit
**Aufgabe:** Liste alle Kunden (Name und Kreditlimit) auf, deren `creditLimit` geringer ist als das Durchschnitts-Kreditlimit *aller* Kunden. Kunden mit einem Kreditlimit von 0 sollen ignoriert werden.

### 15. Unterdeckung im Lagerbestand
**Aufgabe:** Zeige alle Produkte (Name und Bestand), bei denen die Summe der bestellten Menge aus *noch offenen Bestellungen* (`status = 'In Process'`) größer ist als der aktuell verfügbare Lagerbestand (`quantityInStock`).


### 16. Umsatz pro Verkäufer (inklusive Nullnummern)
**Aufgabe:** Berechne den generierten Umsatz (anhand der verkauften Produkte, nicht der Zahlungen) pro Vertriebsmitarbeiter (`jobTitle = 'Sales Rep'`). Verkäufer, die noch gar nichts verkauft haben, sollen zwingend mit `0` in der Liste stehen.

x
### 17. Leistungsstarke Büros
**Aufgabe:** Liste die Städte aller Büros auf, deren betreute Kunden in Summe einen Gesamtumsatz von mehr als 200.000$ generiert haben. Sortiere absteigend nach dem generierten Büro-Umsatz.
 