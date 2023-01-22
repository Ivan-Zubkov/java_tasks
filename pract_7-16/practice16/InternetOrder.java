//file InternetOrder.java
package practice16;

public class InternetOrder implements Order {
    OrderList<Item> list = new OrderList<>();

    public InternetOrder() {}

    public InternetOrder(Item[] k) {
        for (int i = 0; i < k.length;i++)
            list.add(k[i]);
    }

    public boolean add(Item item) {
        return list.add(item);
    }

    public boolean remove(String itemName){
        OrderList.Node<Item> current = list.getFront();
        while (current != null) {
            Item it = current.getData();
            if (it.getName().equals(itemName)) {
                list.remove(it);
                return true;
            }
            current = list.getNext(current);
        }
        return false;
    }

    public int removeAll(String itemName){
        int count = 0 ;
        OrderList.Node<Item> current = list.getFront();
        while (current != null) {
            Item it = current.getData();
            if (it.getName().equals(itemName)) {
                list.remove(it);
                count++;
            }
            current = list.getNext(current);
        }
        return count;
    }

    public int itemQuantity(){
        return list.size();
    }

    public Item[] getItems(){
        Item[] items = new Item[list.size()];
        int i = 0;
        OrderList.Node<Item> current = list.getFront();
        while (current != null) {
            Item it = current.getData();
            if(it != null){
                items[i] = it;
                i++;
            }
            current = list.getNext(current);
        }
        return items;
    }

    public double costTotal() {
        double count = 0;
        OrderList.Node<Item> current = list.getFront();
        while (current != null) {
            Item it = current.getData();
            count += it.getPrice();
            current = list.getNext(current);
        }
        return count;
    }

    public int itemQuantity(String itemName){
        int count = 0;
        OrderList.Node<Item> current = list.getFront();
        while (current != null) {
            Item it = current.getData();
            if (it.getName().equals(itemName))
                count++;
            current = list.getNext(current);
        }
        return count;
    }

    public String[] itemsNames(){
        String[] ret1 = new String[list.size()];
        UnicalNames ret = new UnicalNames (ret1);
        int i = 0;

        OrderList.Node<Item> current = list.getFront();
        while (current != null) {
            Item it = current.getData();
            //ret[i] = it.getName();
            if (ret.nameNotContains(it.getName())) {
                ret.add(i, it.getName());
            }
            i++;
            current = list.getNext(current);
        }
        return ret.mas;
    }

    public Item[] sortedItemsByCostDesc(){
        Item[] k = getItems();
        for (int out = list.size() - 1; out >= 1; out--)
            for (int in = 0; in < out; in++)
                if(k[in].getPrice() < k[in + 1].getPrice()) {
                    Item t = k[in];
                    k[in] = k[in+1];
                    k[in+1] = t;
                }
        return k;
    }
}

/*
int flag = 0;
            Item it = current.getData();
            for (int j = 0; j < list.size(); j++){
                if (ret[j] == it.getName()){
                    flag = 1;
                    break;
                }
            }
            if (flag != 1) {
                ret[i] = it.getName();
            }
            i++;
 */