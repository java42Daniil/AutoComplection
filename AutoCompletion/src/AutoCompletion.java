
public interface AutoCompletion {
	
boolean addWord(String str);
boolean removeWord(String strRemove);
public Iterable<String> getCompletionOptions(String prefix);
}