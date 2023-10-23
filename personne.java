public class personne
{
   public String name;
   public   String firstName;
   public int daynaiss;
   public int monthNaiss;
   public int yearNaiss;

    public personne(String name, String firstName, int daynaiss, int monthNaiss, int yearNaiss)
    {
        this.name = name;
        this.firstName = firstName;
        this.daynaiss = daynaiss;
        this.monthNaiss = monthNaiss;
        this.yearNaiss = yearNaiss;
    }
    public void setName(String nom)
    {
        this.name=nom;
    }

    public void setFirstName(String fn)
    {
        this.firstName=fn;
    }
    public void setDaynaiss(int daten)
    {
        this.daynaiss=daten;
    }
    public void setMonthNaiss(int monthn)
    {
        this.monthNaiss=monthn;
    }
    public void setYearNaiss(int yearn)
    {
        this.yearNaiss=yearn;
    }

    public static  int ageEn2023( int yearNaiss)
    {
        int age=(2023-yearNaiss);
        return age;

    }

}
