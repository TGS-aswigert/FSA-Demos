public class ElvesAI extends GameAI {
    @Override
    public void buildStructures() {
        this.getStructures().add("Tree House");
        System.out.println(this + " have " + getStructures().size() + " Tree Houses");
    }

    @Override
    public void buildUnits() {
        this.getUnits().add(new Elf());
        this.getUnits().add(new Elf());
        System.out.println(this + " have " + getUnits().size() + " Elves");
    }

    @Override
    public void collectResources() {
        for (String structure : this.getStructures()) {
            this.getResources().add("Flower");
        }
        System.out.println(this + " have " + getResources().size() + " Flowers");
    }
}
