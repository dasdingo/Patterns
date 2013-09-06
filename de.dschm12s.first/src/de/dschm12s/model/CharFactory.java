package de.dschm12s.model;

import de.dschm12s.utility.WrongObjectException;

public class CharFactory {

	public static Character getChar(CharacterTypes character){
		switch (character){
		case Elf: return new Elf();
					
		case Orc: return new Orc();
					
		default   : throw new WrongObjectException("Den Charactertyp "+ character+ " gibt es nicht!");
					
			}
	}
}
