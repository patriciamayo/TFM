//https://github.com/BorderCloud/SPARQL-JAVA
import com.bordercloud.sparql.Endpoint;
import java.util.ArrayList;
import java.util.HashMap;

public class mainFile {

	public static void main(String[] args) {
		try {
            Endpoint sp = new Endpoint("https://query.wikidata.org/sparql", false);

            String querySelect = "#Cats\n" +
                "SELECT ?item ?itemLabel \n" +
                "WHERE \n" +
                "{\n" +
                "  ?item wdt:P31 wd:Q146.\n" +
                "  SERVICE wikibase:label { bd:serviceParam wikibase:language \"[AUTO_LANGUAGE],en\". }\n" +
                "}";

            HashMap rs = sp.query(querySelect);
            printResult(rs,30);

        }catch(Exception eex) {
            System.out.println(eex);
            eex.printStackTrace();
        }
	}
	
	public static void printResult(HashMap rs , int size) {
		System.out.print(rs);
//	      for (String variable : (ArrayList) rs.get("result").get("variables")) {
//	        System.out.print(String.format("%-"+size+"."+size+"s", variable ) + " | ");
//	      }
//	      System.out.print("\n");
//	      for (HashMap value : (ArrayList>) rs.get("result").get("rows")) {
//	        for (String variable : (ArrayList) rs.get("result").get("variables")) {
//	          //System.out.println(value.get(variable));
//	          System.out.print(String.format("%-"+size+"."+size+"s", value.get(variable)) + " | ");
//	        }
//	        System.out.print("\n");
//	      }
	   }

}
