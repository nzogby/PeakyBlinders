make:
	cd data && mkdir data_files
	cd data && python run.py
test:
	cd data && mkdir data_files
	cd data && python test.py
clean:
	rm -f meta_data.json data/collect.pyc data/test.pyc
	cd data && rm -rf data_files

