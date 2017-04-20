#Directed graph
#In this sample, properties are added to edges and vertexes directly, without defining them first
graph(directed)beginfunc
	#Defining vertexes and edges
	vertex a;
	vertex b;
	vertex c;
	vertex d;
	vertex e;

	edge x;
	edge y;
	edge z;
	edge t;

	#Adding properties
	a.addProperty("a string property", "a property value");
	b.addProperty("an integer property", 56);
	c.addProperty("a float property", 65.23);
	d.addProperty("a set property", [10, 20, 30, 40, 40]); # One of the 40s will be omitted because of the structure of list
	e.addProperty("a set property with string values", ["ertan", "omer", "arif"]);

	x.addProperty("a simple map property with string keys", {"foo":"bar", "alice":"bob", "encrypt":"decrypt"});
	y.addProperty("a nested map property with integer keys", {
		0 : {"name":"ertuğrul", "type":"instr", "points":[50, 60, 70]},
		1 : {"name":"buğra", "type":"instr", "points":[85, 90, 95]},
		2 : {"name":"altay", "type":"prof", "points":[98, 99, 100]} 
		});
	z.addProperty("a list property", (1, 3, 8, 12, 27, 82));

	x.addProperty("A", 7);
	y.addProperty("B", 7);
	z.addProperty("C", 7);
	t.addProperty("D", 7);

	connect(a, b, x);
	connect(a, c, y);
	connect(b, d, z);
	connect(c, e, t);
endfunc

