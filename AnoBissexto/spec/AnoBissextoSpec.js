describe("AnoBissexto", function() {
	var anoBissexto;

	it("o ano deve ser bissexto - 1600", function() {
		anoBissexto = new AnoBissexto(1600);
		expect(anoBissexto.isBissexto()).toBeTruthy();
	});

	it("o ano deve ser bissexto - 1732", function() {
		anoBissexto = new AnoBissexto(1732);
		expect(anoBissexto.isBissexto()).toBeTruthy();
	});

	it("o ano deve ser bissexto - 1888", function() {
		anoBissexto = new AnoBissexto(1888);
		expect(anoBissexto.isBissexto()).toBeTruthy();
	});

	it("o ano deve ser bissexto - 1944", function() {
		anoBissexto = new AnoBissexto(1944);
		expect(anoBissexto.isBissexto()).toBeTruthy();
	});

	it("o ano deve ser bissexto - 2008", function() {
		anoBissexto = new AnoBissexto(2008);
		expect(anoBissexto.isBissexto()).toBeTruthy();
	});

	it("o ano nao deve ser bissexto - 1742", function() {
		anoBissexto = new AnoBissexto(1742);
		expect(anoBissexto.isBissexto()).toBeFalsy();
	});

	it("o ano nao deve ser bissexto - 1889", function() {
		anoBissexto = new AnoBissexto(1889);
		expect(anoBissexto.isBissexto()).toBeFalsy();
	});

	it("o ano nao deve ser bissexto - 1951", function() {
		anoBissexto = new AnoBissexto(1951);
		expect(anoBissexto.isBissexto()).toBeFalsy();
	});

	it("o ano nao deve ser bissexto - 2011", function() {
		anoBissexto = new AnoBissexto(2011);
		expect(anoBissexto.isBissexto()).toBeFalsy();
	});

});