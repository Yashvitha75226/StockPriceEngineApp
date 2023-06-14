package com.stocks.StockPriceEngineApp.dto;


	public enum Company{
		IBM(0),Zensar(1),APPLE(2);
		private int id;

		private Company(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
	}

