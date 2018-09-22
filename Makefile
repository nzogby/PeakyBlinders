make:
	cd data && python test.py
clean:
	rm -f meta_data.json
	cd data/data_files && rm -f *

