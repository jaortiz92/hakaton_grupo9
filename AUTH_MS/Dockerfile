FROM python:3
ENV PYTHONNUMBUFFERED 1
RUN mkdir /users 
WORKDIR /users
ADD . /users
RUN pip3 install -r requirements.txt
EXPOSE 8080
CMD python3 manage.py makemigrations authApp && python3 manage.py migrate && python3 manage.py  runserver 0.0.0.0:$PORT
