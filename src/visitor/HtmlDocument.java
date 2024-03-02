package visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {


    private List<HtmlNode> nodes = new ArrayList<>();

    void add(HtmlNode node){
        nodes.add(node);
    }

    void execute(Operation operation){

        for(HtmlNode node : nodes)
            node.execute(operation);

    }



}
