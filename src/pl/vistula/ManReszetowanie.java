package pl.vistula;

public class ManReszetowanie {
    public static void main(String[] args) {
        String sourceData = "Это Иван. Ему 34 года. Его рост 166.3 см. Должность \"Программист\"";
        String name = sourceData.substring(4,8);
        String ageString = sourceData.substring(14,16);
        int age = Integer.parseInt(ageString);
        String heightString = sourceData.substring(32,37);
        double height = Double.parseDouble(heightString);
        String position = sourceData.substring(53, 64);
        Man man = new Man(name,position,age, height);
        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " года " + man.getHeight() + "см.");
    }

    public static class Man {

        private String name;
        private String position;
        private int age;
        private double height;

        public Man(String name, String position, int age, double height) {
            this.name = name;
            this.position = position;
            this.age = age;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public int getAge() {
            return age;
        }

        public double getHeight() {
            return height;
        }
    }

}
