import java.util.Arrays;
import java.util.Objects;

public class Consignment {
    protected String description;
    protected PackedGoods[]  arr;
    Consignment(String descr, PackedGoods ... array ) {
        description = descr;
        arr = new PackedGoods[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
    }
       public int  grossMassConsignment(){
            int grossMassSum = 0;
            for(int i = 0; i < arr.length;i++ )
            {
                grossMassSum = grossMassSum + arr[i].grossMass();

            }
            return grossMassSum;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consignment that = (Consignment) o;
        return Objects.equals(description, that.description) && Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackedGoods[] getArr() {
        return arr;
    }


    @Override
    public String toString() {
        return  "Описание партии: "+ getDescription() + "\nНаборы:\n"  + Arrays.toString(getArr());
    }

}
