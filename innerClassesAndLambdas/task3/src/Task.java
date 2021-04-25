public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        Resume.Education education = r.new Education("NEIU", "Computer Science");
        r.addEducation(education);
        Resume.Experience experience1 = new Resume.Experience("Engineer", 2017, 2021);
        r.addExperience(experience1);
        r.addExperience(new Resume.Experience("Milkman", 1952, 1960));
        r.addExperience(new Resume.Experience("Bartender", 1992, 1999));
        r.addExperience(new Resume.Experience("Pilot", 2011, 2020));

        System.out.println(r);
    }
}