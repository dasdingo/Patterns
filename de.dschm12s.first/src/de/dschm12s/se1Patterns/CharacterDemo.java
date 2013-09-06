package de.dschm12s.se1Patterns;

public class CharacterDemo {
public static void main(String[] args) {
	Character elf = CharFactory.getChar(CharacterTypes.Elf);
	Character orc = CharFactory.getChar(CharacterTypes.Orc);
	
	elf.sprechen();
	
}
}
