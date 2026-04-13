package td11;

public class ColorView implements View{
    @Override
    public void makeTitle(String title) {
        System.out.println("|-------|");
        System.out.println("| \u001B[34m" + title + " \u001B[39m |");
        System.out.println("|-------|");
    }

    @Override
    public void makeSubTitle(String subtitle) {

    }

    @Override
    public void makeItem(String sentence) {

    }

    @Override
    public void makeParagraph(String paragraph) {

    }

    static void main() {
        ColorView jp = new ColorView();
        jp.makeTitle("lamala");
    }
}
