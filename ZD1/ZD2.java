public class ZD2 {
    public static void main(String[] args) {
        Student st = new Student();
        Student[] stud = new Student[10];
        Student stud1 = new Student(1, "Бур", "Вася", "Алексеевич", "12,12,2002", "Калининград", "375299944882", "Программирование", 1, "ИС20-1");
        Student stud2 = new Student(2, "Бузук", "Сергей", "Дмитриевич", "29,04,2002", "Калининград", "375299944882", "Системные администраторы", 3, "СА18-1");
        Student stud3 = new Student(3, "Сивко", "Елена", "Григорьевна", "7,02,2001", "калининград", "375299944882", "Программирование", 3, "ИС18-1");
        Student stud4 = new Student(4, "Кошур", "Андрей", "Васильевич", "21,06,2003", "Калининград", "375299944882", "Программирование", 1, "ИC20-2");
        Student stud5 = new Student(5, "Скварада", "Ольга", "Сергеевна", "16,10,2003", "Калининград", "375299944882", "Программирование", 1, "ИС20-1");
        Student stud6 = new Student(6, "Федотов", "Андрей", "Алексеевич", "22,12,2002", "Калининград", "375299944882", "Программирование", 3, "ИС18-2");
        Student stud7 = new Student(7, "Алексеев", "Сергей", "Антонович", "14,05,2002", "Калининград", "375299944882", "Системные администраторы", 3, "СА18-1");
        Student stud8 = new Student(8, "Леванова", "Елена", "Шилатова", "17,09,2001", "Калининград", "375299944882", "Программирование", 1, "ИС20-2");
        Student stud9 = new Student(9, "Коршун", "Андрей", "Матвеевич", "21,10,2003", "Калининград", "375299944882", "Программирование", 3, "ИС18-1");
        Student stud10 = new Student(10, "Сергеевна", "Ольга", "Андреевна", "16,06,2003", "Калининград", "375299944882", "Системные администраторы", 3, "СА18-1");
        stud[0] = stud1;
        stud[1] = stud2;
        stud[2] = stud3;
        stud[3] = stud4;
        stud[4] = stud5;
        stud[5] = stud6;
        stud[6] = stud7;
        stud[7] = stud8;
        stud[8] = stud9;
        stud[9] = stud10;

        for (Student s : stud) {
            s.show();
        }
        System.out.println("Факультет Системные администраторы:");
        for (Student s : stud) {
            s.fakultet("Системные администраторы");
        }
        System.out.println("Факультет Системные администраторы - 1 курс");
        for (Student s : stud) {
            s.listFakultet("Системные адмимнистраторы", 1);
        }
        System.out.println("Факультет Системные администраторы - 3 курс");
        for (Student s : stud) {
            s.listFakultet("Системные адмимнистраторы", 3);
        }
        System.out.println("Факультет Программирование - 1 курс");
        for (Student s : stud) {
            s.listFakultet("Программирование", 1);
        }
        System.out.println("Факультет Программирование - 3 курс");
        for (Student s : stud) {
            s.listFakultet("Программирование", 3);
        }
        System.out.println("Студенты с 2001г рождения:");
        for (Student s : stud) {
            s.vozrast(2001);
        }
        System.out.println("Факультет Программирование - группы");
        for (Student s : stud) {
            s.group ("ИС18-1");
        }
        for (Student s : stud) {
            s.group ("ИС18-2");
        }
        for (Student s : stud) {
            s.group ("ИС20-1");
        }
        for (Student s : stud) {
            s.group ("ИС20-2");
        }
        for (Student s : stud) {
            s.group ("СА18-1");
        }
        for (Student s : stud) {
            s.group ("СА18-2");
        }
        for (Student s : stud) {
            s.group ("СА20-1");
        }
        for (Student s : stud) {
            s.group ("СА20-2");
        }
    }

    static class Student {
        private int id;
        private String familia;
        private String name;
        private String otchestvo;
        private String birthday;
        private String adress;
        private String phoneNumber;
        private String fakultet;
        private int kurs;
        private String group;

        public Student() {

        }

        public Student(int id, String familia, String name, String otchestvo, String birthday, String adress, String phoneNumber,
                       String fakultet, int kurs, String group) {
            this.id = id;
            this.familia = familia;
            this.name = name;
            this.otchestvo = otchestvo;
            this.birthday = birthday;
            this.adress = adress;
            this.phoneNumber = phoneNumber;
            this.fakultet = fakultet;
            this.kurs = kurs;
            this.group = group;
        }


        public int getId() {
            return id;
        }

        public String getFamilia() {
            return familia;
        }

        public String getName() {
            return name;
        }

        public String getOtchestvo() {
            return otchestvo;
        }

        public String getBirthday() {
            return birthday;
        }

        public String getAdress() {
            return adress;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getFakultet() {
            return fakultet;
        }

        public int getKurs() {
            return kurs;
        }

        public String getGroup() {
            return group;
        }


        public void setId(int id) {
            this.id = id;
        }

        public void setFamilia(String familia) {
            this.familia = familia;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOtchestvo(String otchestvo) {
            this.otchestvo = otchestvo;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setFakultet(String fakultet) {
            this.fakultet = fakultet;
        }

        public void setKurs(int kurs) {
            this.kurs = kurs;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public void show() {
            System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                    + " " + getKurs() + " " + getGroup());
        }

        public void fakultet (String fakultet) {
                if (this.getFakultet().equals("Системные администраторы")) {
                    System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                            + " " + getKurs() + " " + getGroup());
                }
            }


        public void listFakultet(String fakultet, int kurs) {

            if (getFakultet().equals(fakultet) && getKurs() == kurs) {

                System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                        + " " + getKurs() + " " + getGroup());
            }
        }

        public void vozrast(int years) {
            String[] strBirthday = getBirthday().split(",");
            //System.out.print(strBirthday[0] + " " + strBirthday[1] + " " + strBirthday[2]);
            int year = (int) Integer.valueOf(strBirthday[2]);
            if (year >= years) {
                System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getBirthday() + " " + getAdress() + " " + getPhoneNumber() + " " + getFakultet()
                        + " " + getKurs() + " " + getGroup());
            }
        }

        public void group(String group) {
            if (getFakultet().equals(fakultet) && getGroup() == group) {
                {
                    System.out.println(getId() + " " + getFamilia() + " " + getName() + " " + getOtchestvo() + " " + getFakultet()
                            + " " + getKurs() + " " + getGroup());
                }
            }
        }
    }
}
