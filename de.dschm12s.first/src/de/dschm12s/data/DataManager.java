package de.dschm12s.data;

public class DataManager {

	private DataPersistenceStrategy dataPersistenceStrategy;
	
	
	
	public DataManager(DataPersistenceStrategy dataPersistenceStrategy){
		this.dataPersistenceStrategy = dataPersistenceStrategy;
	}
public DataPersistenceStrategy getDataPersistenceStrategy(){
	return this.dataPersistenceStrategy;
}
}
