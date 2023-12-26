public class FinishStringFilter implements Filter {
    String pattern;
    FinishStringFilter(String str){
        pattern = str;
    }
    @Override
    public boolean apply(String str){
        boolean result = false;
        if(str.endsWith(pattern)  ) {
            result = true;
        }
        return result;
    }
}
