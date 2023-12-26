public class GoodsService {
    public int  countByFilter(Consignment prod, Filter f){
        int count = 0;
        for(int i = 0;i < prod.getArr().length; i++)
        {
            if(f.apply(prod.getArr()[i].GetName()) ) {
                count++;
            }
        }
        return count;
    }
}
