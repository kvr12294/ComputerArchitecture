all :
	@echo "Compiling APEX Simulator..."
	@rm -rf classes
	@mkdir classes
	@javac -sourcepath src src/edu/binghamton/my/main/APEXSimulatorRunner.java -d classes

	@echo "Executing APEX..."
	@cd classes; java edu/binghamton/my/main/APEXSimulatorRunner ${file}

