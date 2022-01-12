import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AutoComplectionImpl implements AutoCompletion {
	private Collection<String> strCollection;

	public AutoComplectionImpl(Collection<String> collection) {
		this.strCollection = collection;
	}
	@Override
	public boolean addWord(String str) {
		return strCollection.add(str);
	}

	@Override
	public boolean removeWord(String strRemove) {
		
		return strCollection.remove(strRemove);
	}

	@Override
	public Iterable<String> getCompletionOptions(String prefix) {
		List<String> listOfWordsStartsWith = new ArrayList<>();
		if (!strCollection.isEmpty()) {
			strCollection.forEach(word -> {
				if (word.startsWith(prefix)) 
					listOfWordsStartsWith.add(word);
			});
		}
		return listOfWordsStartsWith;
	}

}