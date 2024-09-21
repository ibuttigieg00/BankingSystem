import java.util.Date;

public abstract class Client {
    protected String Name;
    protected String Surname;
    protected Date DOB;
    protected String Locality;
    protected String ID;

    public abstract void setName(String NameIn);
    public abstract void setSurname(String SurnameIn);
    public abstract void setDOB(Date DOBIn);
    public abstract void setLocality(String LocalityIn);
    public abstract void setClientID(String IDIn);
}