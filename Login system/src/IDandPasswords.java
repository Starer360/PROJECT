import java.util.HashMap;

public class IDandPasswords 
{
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IDandPasswords()
    {
        logininfo.put("Starer360", "123456");
        logininfo.put("STAR", "567949");
        logininfo.put("abc123", "abc123");
    }
    protected HashMap getLoginInfo()
    {
        return logininfo;
    }
    
}
