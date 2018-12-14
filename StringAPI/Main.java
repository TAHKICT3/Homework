package StringAPI;

public class Main {
    public static void main(String[] args) {
        String text = "The Sectoid hierarchy ranges from soldiers to leaders with powerful psionic abilities. These psionic powers can be used to demoralise soldiers in combat, or even take control of their minds. They tend to indulge in human abductions and cattle mutilation. The abduction is used to extract genetic material for cross breeding and developing clones for infiltrating human society. The cattle provide both nutrition and genetic material. This race appears to want to develop superior genetic hybrids to increase the efficiency of their hive-like society. The autopsy reveals vestigial digestive organs and a simple structure. The brain and eyes are very well developed. The structure suggests genetic alteration or mutation. The small mouth and nose appear to have little function. The webbing between the fingers and the flat feet suggest aquatic origins. There are no reproductive organs and no clues as to how this species can reproduce. They are most probably a genetically engineered species.";
        char a = 'a';
        int i = 0;
        while(i < text.length()) {
            if (i == -1)
                break;
            if (text.lastIndexOf(a, i) != -1) {
                System.out.println(text.indexOf(a, i));
                i = text.indexOf(a, i);
            }
            i++;
        }
    }
}
