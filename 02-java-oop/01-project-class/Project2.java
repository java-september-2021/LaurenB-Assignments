public class Project2 {
    // Attributes / Fields
    private String name;
    private String description;

    //Methods
    public String elevatorPitch() {
        return this.name + ":" + this.description;
    }

    // Constructors
    public Project2(){
        this.name = "Name please";
        this.description = "Description please";
    }

    public Project2(String name){
        this.name = name;
        this.description = "Description please";
    }

    public Project2(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
