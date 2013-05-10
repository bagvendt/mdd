package dk.autointents.m2m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import IntentDSL.Intent;
import IntentDSL.IntentModel;

public class ModelHelper {
	private IntentModel model;

	public ModelHelper(IntentModel model) {
		this.model = model;
	}

	public String[] getCategories() {
		Set<String> categories = new HashSet<String>();
		for (Intent intent : model.getIntents()) {
			categories.add(intent.getMetaCategory());
		}
		return categories.toArray(new String[0]);
	}

	public ArrayList<Intent> getIntentsByCategory(String category) {
		ArrayList<Intent> intents = new ArrayList<Intent>();
		for (Intent intent : model.getIntents()) {
			if (intent.getMetaCategory().equalsIgnoreCase(category)) {
				intents.add(intent);
			}
		}

		return intents;
	}

	public Intent getIntentByName(String name) {
		for (Intent intent : model.getIntents()) {
			if (intent.getName().equalsIgnoreCase(name)) {
				return intent;
			}
		}
		return null;
	}
}
