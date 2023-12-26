public class FindStringFilter implements Filter{
    String pattern;
    FindStringFilter(String str){
        pattern = str;
    }
    @Override
    public boolean apply(String str){
        boolean result = false;
        if(str.indexOf(pattern) != -1) {
            result = true;
        }
        return result;
    }
}
