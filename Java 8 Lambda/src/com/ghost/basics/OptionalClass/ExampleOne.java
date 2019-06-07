package com.ghost.basics.OptionalClass;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ExampleOne {

	public static void main(String[] args) {

		Function<String, String> giveSecondWord = (String line) -> line.split(" ").length > 1 ? line.split(" ")[1] : null;
		 
		//System.out.println(giveSecondWord.apply("rudresh sir has gone hm"));
		//ToIntFunction<String> getLenth = word -> word.length(); 
		//
		Function<String , Integer> getLenth = word -> word.length(); 
		
		
		// and then will work only on Funtion type 
		Integer integer = giveSecondWord.andThen(getLenth).apply("helo Kshitij");
		System.out.println(integer);
		
		Optional<String> myValue = Optional.ofNullable(giveSecondWord.apply("yes asade"));
	//	myValue.ifPresent(value -> System.out.println(value));
		System.out.println(myValue.orElse("no value"));
		
		if(myValue.isPresent()) {
		String newValue = myValue.map(  word -> word + word ).get();
		System.out.println(newValue );
		}
		
	};

}
