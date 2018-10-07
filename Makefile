make:
	make clean
	mkdir data/data_files/types data/data_files/storage
	cd data && python run.py
test:
	make clean
	mkdir data/data_files/types data/data_files/storage
	cd data && python test.py
clean:
	rm -f meta_data.json data/collect.pyc data/test.pyc
	cd data/data_files && rm -rf types storage

