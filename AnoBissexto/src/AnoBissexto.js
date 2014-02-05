function AnoBissexto(ano) {
	this.ano = ano;
}
AnoBissexto.prototype.isBissexto = function() {
	//Um determinado ano é bissexto se:
	//- O ano for divisível por 4, mas não divisível por 100, exceto se ele for também divisível por 400.
	if(this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0)) {
		return true;
	}
	return false;
};