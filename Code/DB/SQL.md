## Einfache bis Mittlere Aufgaben (Basics, JOINs & GROUP BY)

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

## Anspruchsvolle Aufgaben (Komplexe JOINs, HAVING & Logik)

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