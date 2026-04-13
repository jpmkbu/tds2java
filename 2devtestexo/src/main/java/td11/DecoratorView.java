package td11;

public class DecoratorView implements View {
    @Override
    public void makeTitle(String title) {
        System.out.println("|-------|");
        System.out.println("| " + title + "|");
        System.out.println("|-------|");
        
    }

    @Override
    public void makeSubTitle(String subtitle) {
        System.out.println(subtitle);
        System.out.println("--------");
    }

    @Override
    public void makeItem(String sentence) {
        System.out.println("* " + sentence);
    }

    @Override
    public void makeParagraph(String paragraph) {
        System.out.println(paragraph);
    }

    static void main() {
//        DecoratorView jp = new DecoratorView();
//        jp.makeTitle("lamala");
//        jp.makeSubTitle("vista");
//        jp.makeParagraph(" focus");
//        jp.makeItem("ce qu'on doit faire");
//        jp.makeItem("no distruction");
//        jp.makeItem("target");
    }
}
