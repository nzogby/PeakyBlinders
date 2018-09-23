make:
	cd data && python run.py
test:
	cd data && python test.py
clean:
	rm -f meta_data.json data/collect.pyc data/test.pyc
	cd data/data_files && rm -f *

