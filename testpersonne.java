public class testpersonne {
    public static void main(String[]args)
    {
        personne p1=new personne("ahmed","mefteh",25,5,1996);
        p1.setName("rihem");
        System.out.println("le nom est:"+p1);
        p1.setFirstName("Ben mefteh");
        System.out.println("le prenom :"+p1);

        p1.setDaynaiss(16);
        System.out.println("la date  est:"+p1);

        p1.setDaynaiss(01);
        System.out.println("la date est:"+p1);

        p1.setDaynaiss(2023);
        System.out.println("la date:"+p1);







    }
}
