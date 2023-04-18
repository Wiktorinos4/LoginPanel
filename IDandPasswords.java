import java.util.HashMap;

public class IDandPasswords 
{
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords()
    {
        logininfo.put("Test","123");
        logininfo.put("Test2","1234");
    }
    protected HashMap getLogininfo() 
    {
        return logininfo;
    }
}
