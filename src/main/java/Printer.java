public class Printer {

    private int paperLeft;
    private int tonerLeft;

    public Printer(int paper, int toner){
        this.paperLeft = paper;
        this.tonerLeft = toner;
    }

    public int getPaper(){
        return this.paperLeft;
    }

    public int getToner() {
        return this.tonerLeft;
    }

    public void print(int papers, int copies) {
        int papersToPrint = papers * copies;
        if (this.paperLeft >= papersToPrint){
            this.paperLeft -= papersToPrint;
            this.tonerLeft -= papersToPrint;
        }
    }

}
