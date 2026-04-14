package Code.Datenstrukturen.Baum;

public class Baum {
    
    private BaumNode root;

    public void insert(int data){
        BaumNode newNode = new BaumNode(data);

        if(root == null) root = newNode;
        else{
            BaumNode curr = root;

            while(true){
                if(data < curr.getData()){
                    if(curr.getLeft() == null){
                        curr.setLeft(newNode);
                        break;
                    }
                    else curr = curr.getLeft();
                }
                else{
                    if(curr.getRight() == null){
                        curr.setRight(newNode);
                        break;
                    }
                    else curr = curr.getRight();
                }
            }
        }
    }

    public void insertRec(int data){
        root = insertRec(root, data);
    }
    private BaumNode insertRec(BaumNode root, int data){
        if(root == null){
            root = new BaumNode(data);
            return root;
        }
        if(data < root.getData()) root.setLeft(insertRec(root.getLeft(), data));
        else if(data > root.getData()) root.setRight(insertRec(root.getRight(), data));
        return root;
    }


    public BaumNode search(int data){
        BaumNode curr = root;

        while(curr != null){
            if(data == curr.getData()) return curr;
            else if(data < curr.getData()) curr = curr.getLeft();
            else curr = curr.getRight();
        }
        return null;
    }

    public BaumNode searchRec(int data){
        return searchRec(root, data);
    }
    private BaumNode searchRec(BaumNode root, int data){
        if(root == null) return null;
        if(data == root.getData()) return root;
        if(data < root.getData()) return searchRec(root.getLeft(), data);
        else return searchRec(root.getRight(), data);
    }


    public int count(){
        return countRec(root, 0);
    }
    private int countRec(BaumNode root, int count){
        if(root == null) return count;
        return countRec(root.getRight(), count++) + countRec(root.getLeft(), count++);
    }


    public int getLevel(int key){
        if(root == null) return -1;

        BaumNode curr = root;
        int level = 0;

        while(curr != null ){
            if(key > curr.getData()) curr.getRight();
            else curr.getLeft();
            level++;
            if(curr.getData() == key) return level;
        }
        return -1;
    }

    public int getLevelRec(int key){
        return getLevelRec(root, 0, key);
    }
    private int getLevelRec(BaumNode root, int level, int key){
        if(root == null) return -1;
        if(root.getData() == key) return level;
        if(key > root.getData()) return getLevelRec(root.getRight(), level++, key);
        if(key < root.getData()) return getLevelRec(root.getLeft(), level++, key);
        return level;
    }

    public void preorder(BaumNode root){
        if(root == null) return;
        System.out.println(root.getData());
        preorder(root.getLeft()); preorder(root.getRight());
    }

    public void inorder(BaumNode root){
        if(root == null) return;
        preorder(root.getLeft()); 
        System.out.println(root.getData());
        preorder(root.getRight());
    }

    public void postorder(BaumNode root){
        if(root == null) return;
        preorder(root.getLeft()); preorder(root.getRight());
        System.out.println(root.getData());
    }








































    public void delete(int data){
        root = deleteRec(root, data);
    }
    private BaumNode deleteRec(BaumNode root, int data){
        if(root == null) return root;

        if(data < root.getData()) root.setLeft(deleteRec(root.getLeft(), data));
        else if(data > root.getData()) root.setRight(deleteRec(root.getRight(), data));
        else{
            if(root.getLeft() == null) return root.getRight();
            else if(root.getRight() == null) return root.getLeft();

            root = minValueNode(root.getRight());
            root.setRight(deleteRec(root.getRight(), root.getData()));
        }
        return root;
    }
    private BaumNode minValueNode(BaumNode node){
        BaumNode current = node;
        while(current.getLeft() != null) current = current.getLeft();
        return current;
    }
}
