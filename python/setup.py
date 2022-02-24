#!/usr/bin/env python

from setuptools import setup, find_packages

description = 'Python API for sparkDetective, a tool for performance troubleshooting of Apache Spark workloads'

long_description = """SparkDetective is a tool for performance troubleshooting of Apache Spark workloads.
It simplifies the collection and analysis of Spark performance metrics. The bulk of sparkDetective is written in Scala.
This package contains the Python API for sparkDetective and is intended to work in conjunction with PySpark.
Use from python command line or in Jupyter notebook environments, or as a tool to instrument Python code running Spark workloads.

setup(name='sparkdetective',
    version='0.14.0',
    description=description,
    long_description=long_description,
    long_description_content_type="text/markdown",
    author='Kumar Sambhav',
    author_email='sambhav.kumar37@gmail.com',
    url='https://github.com/sambhav37/sparkDetective',
    license='Apache License, Version 2.0',
    include_package_data=True,
    packages=find_packages(),
    zip_safe=False,
    python_requires='>=2.7',
    install_requires=[],
    classifiers=[
    'Programming Language :: Python :: 2.7',
    'Programming Language :: Python :: 3',
    'Operating System :: OS Independent',
    'License :: OSI Approved :: Apache Software License',
    'Intended Audience :: Developers',
    'Development Status :: 4 - Beta',
    ]
    )
