package Day29_StaticKeyword;


    class Student{
        int number;
        String name;
        static String coollege;

        Student(int r,String n,String coollege){
            this.number = r;
            this.name = n;
            this.coollege = coollege;
        }

        public static void main(String[] args) {
            Student s1 = new Student(111,"karan","MIT");
            Student s2 = new Student(222,"aryan","harvard");

            System.out.println(s1.number);
            System.out.println(s2.number);
            System.out.println(s1.name);
            System.out.println(s2.name);
            System.out.println(s1.coollege);
            System.out.println(s2.coollege);

        }
    }

