package de.dschm12s.model;

import de.dschm12s.utility.WrongObjectException;

public class CharFactory {
//TODO : Builder instead of Factory
	public static Character getChar(CharacterTypes character){
		switch (character){
		case Elf: return new Elf("Elf", "Elf", 1, 1);
					
		case Orc: return new Orc("Orc", "Orc", 1, 1);
					
		default   : throw new WrongObjectException("Den Charactertyp "+ character+ " gibt es nicht!");
					
			}
	}
}
