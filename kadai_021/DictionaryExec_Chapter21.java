package kadai_021;

import java.util.HashMap;

public class DictionaryExec_Chapter21 {
	public void DictionaryExec(String[] array) {
		HashMap<String,String> englishDictionary = new HashMap<String,String>();
		englishDictionary.put("apple", "りんご");
		englishDictionary.put("peach", "桃");
		englishDictionary.put("banana", "バナナ");
		englishDictionary.put("lemon", "レモン");
		englishDictionary.put("pear", "梨");
		englishDictionary.put("kiwi", "キウィ");
		englishDictionary.put("strawberry", "いちご");
		englishDictionary.put("grape", "ぶどう");
		englishDictionary.put("muscat", "マスカット");
		englishDictionary.put("cherry", "さくらんぼ");
		
		for (String name: array) {
			if (name == "apple" || name == "peach" || name == "banana" || name == "lemon" || name == "pear" || name == "kiwi" || name == "straberry" || name == "grape" || name == "muscat" || name == "cherry") {
				System.out.println(name + "の意味は" + englishDictionary.get(name));
			} else {
				System.out.println(name + "は辞書に存在しません");
			}
		}
	}
}
