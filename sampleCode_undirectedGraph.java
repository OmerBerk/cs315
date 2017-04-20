#Undirected graph
#This graph defines 4 students and uses edges to specify their relations i.e. hometown or university

graph(undirected) beginfunc
	#Vertex definitions
	vertex ertan;
	vertex arif;
	vertex furkan;
	vertex omer;

	#Edge definitions
	edge ankaraEdge;
	edge istanbulEdge;
	edge bilkentEdge;

	#Ankara
	property ankara;
	ankara = "ankara";

	#Istanbul
	property istanbul;
	istanbul = "istanbul";

	#Bilkent
	property bilkent;
	bilkent = "bilkent";

	#Omer's grades
	property grades;
	grades = {"cs202":{"homeworks":[90, 90, 77], "quizzes":[100, 90], "midterm":85, "final":86.4, "letterGrade":"A"}, ge100:"A"};

	#Adding edge properties
	ankaraEdge.addProperty("city", ankara);
	istanbulEdge.addProperty("city", istanbul);
	bilkentEdge.addProperty("university", bilkent);

	#Adding grades to omer
	omer.addProperty(grades);

	#Connecting vertices with edges
	connect(ertan, arif, istanbulEdge);
	connect(furkan, omer, ankaraEdge);
	connect(omer, arif, bilkentEdge);
endfunc
request( graph, omer arif|furkan, 2);
request( graph, ertan arif+, 3);
request( graph, grades{"midterm"}> 70, 2);
request( graph, ertan.city=="istanbul", 1);
request( graph, ertan|omer arif, 1);

