FROM clojure

COPY . /usr/src/app

MKDIR /usr/src/app

CMD ["lein" , "test"]