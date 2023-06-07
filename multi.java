class Student{
        int Roll;
        String Name =new String();
        void GetData(){
            Roll =503336;
            Name = "Shiboshree Roy";
        }
        void Display(){
            System.out.println("Student name:"+Name);
            System.out.println("Student Roll:"+Roll);
    }
}
class Exam extends Student{
    float Mark;
    void GetData(){
        Mark = 3.40f;
    }
    void Display(){
        System.out.println("Inside Exam class-----");
        System.out.println("Mark:"+Mark);
    }
}
class Result extends Exam{
    Student S = new Student();
    Exam E =new Exam();
    void GetData(){
        S.GetData();
        E.GetData();
    }
    void Display(){
        S.Display();
        E.Display();
    }
}
class multi
{
    public static void main(String args[])
    {
        Result R = new Result();
        R.GetData();
        R.Display();
    }
}

