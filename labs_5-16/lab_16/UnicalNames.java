//file UnicalName.java
package lab_16;

public class UnicalNames {
    public String[] mas;

    public UnicalNames(String[] mas) {
        this.mas = mas;
    }

    public boolean nameNotContains(String name) {
        int flag = 0;
        for (int i = 0; i < mas.length;i++){
            if (mas[i] == null){
                continue;
            }
            if (mas[i].equals(name)){
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            return false;
        }
        return true;
    }

    public void add(int index, String name){
        mas[index] = name;
    }
}
