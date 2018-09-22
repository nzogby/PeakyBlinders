make:
	cd data && python run.py
clean:
	rm -f meta_data.json data/collect.pyc
	cd data/data_files && rm -f *

