public class BeginStringFilter implements Filter {
    protected String pattern;
    BeginStringFilter(String str){
        pattern = str;
    }
    @Override
    public boolean apply(String str){
        boolean result = false;
        if(str.startsWith(pattern) ) {
            result = true;
        }
        return result;
    }

}
