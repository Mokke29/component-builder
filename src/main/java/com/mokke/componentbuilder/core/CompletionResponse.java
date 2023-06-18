package com.mokke.componentbuilder.core;

import java.util.List;
import java.util.Optional;

public record CompletionResponse(Usage usage, List<Choice> res) {

	public Optional<String> firstAnswer() {
		if (res == null || res.isEmpty())
			return Optional.empty();
		return Optional.of(res.get(0).text);
	}
	
	record Usage(int total_tokens, int prompt_tokens, int completion_tokens) {}
	
	record Choice(String text) {}
}