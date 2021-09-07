public class ProjectTest {
    public static void main(String[] args) {
        Project2 projectOne = new Project2();
        System.out.println(projectOne.getName());
        System.out.println(projectOne.getDescription());
        System.out.println(projectOne.elevatorPitch());

        Project2 projecttwo = new Project2("Lauren");
        System.out.println(projecttwo.getName());
        System.out.println(projecttwo.getDescription());
        System.out.println(projecttwo.elevatorPitch());

        Project2 projectthree = new Project2("Sarah", "New project");
        System.out.println(projectthree.elevatorPitch());
        projectthree.SetName("Will");
        projectthree.setDescription("Another new project");
        System.out.println(projectthree.getName());
        System.out.println(projectthree.getDescription());
    }
}
