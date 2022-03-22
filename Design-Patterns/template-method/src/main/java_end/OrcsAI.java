public class OrcsAI extends GameAI {

    @Override
    public void buildStructures() {
        this.getStructures().add("Straw Hut");
        System.out.println(this + " have " + getStructures().size() + " Straw Huts");
    }

    @Override
    public void buildUnits() {
        this.getUnits().add(new Orc());
        System.out.println(this + " have " + getUnits().size() + " Orcs");
    }

    @Override
    public void collectResources() {
        for (String structure : this.getStructures()) {
            this.getResources().add("Bone");
            this.getResources().add("Bone");
        }
        System.out.println(this + " have " + getResources().size() + " Bones");
    }
}
