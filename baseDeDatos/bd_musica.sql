PGDMP       	                |            musica    15.8    16.4                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            	           1262    16423    musica    DATABASE     z   CREATE DATABASE musica WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE musica;
                postgres    false            �            1259    16513    artistas    TABLE     b  CREATE TABLE public.artistas (
    id bigint NOT NULL,
    fecha_nacimiento integer,
    nombre_artista character varying(255),
    tipo_artista character varying(255),
    CONSTRAINT artistas_tipo_artista_check CHECK (((tipo_artista)::text = ANY ((ARRAY['SOLISTA'::character varying, 'DUO'::character varying, 'BANDA'::character varying])::text[])))
);
    DROP TABLE public.artistas;
       public         heap    postgres    false            �            1259    16512    artistas_id_seq    SEQUENCE     �   ALTER TABLE public.artistas ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.artistas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    215            �            1259    16522 	   canciones    TABLE       CREATE TABLE public.canciones (
    id bigint NOT NULL,
    album character varying(255),
    banda character varying(255),
    fecha_de_lanzamiento integer,
    genero character varying(255),
    nombre_cancion character varying(255),
    artista_id bigint
);
    DROP TABLE public.canciones;
       public         heap    postgres    false            �            1259    16521    canciones_id_seq    SEQUENCE     �   ALTER TABLE public.canciones ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.canciones_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    217                      0    16513    artistas 
   TABLE DATA           V   COPY public.artistas (id, fecha_nacimiento, nombre_artista, tipo_artista) FROM stdin;
    public          postgres    false    215   �                 0    16522 	   canciones 
   TABLE DATA           o   COPY public.canciones (id, album, banda, fecha_de_lanzamiento, genero, nombre_cancion, artista_id) FROM stdin;
    public          postgres    false    217   F       
           0    0    artistas_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.artistas_id_seq', 15, true);
          public          postgres    false    214                       0    0    canciones_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.canciones_id_seq', 38, true);
          public          postgres    false    216            l           2606    16520    artistas artistas_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.artistas
    ADD CONSTRAINT artistas_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.artistas DROP CONSTRAINT artistas_pkey;
       public            postgres    false    215            p           2606    16528    canciones canciones_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.canciones
    ADD CONSTRAINT canciones_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.canciones DROP CONSTRAINT canciones_pkey;
       public            postgres    false    217            n           2606    16530 $   artistas ukhpry58xm0msjyossxf8n01wbf 
   CONSTRAINT     i   ALTER TABLE ONLY public.artistas
    ADD CONSTRAINT ukhpry58xm0msjyossxf8n01wbf UNIQUE (nombre_artista);
 N   ALTER TABLE ONLY public.artistas DROP CONSTRAINT ukhpry58xm0msjyossxf8n01wbf;
       public            postgres    false    215            q           2606    16531 %   canciones fkjj29ydwq328lf22r8sgthayfu    FK CONSTRAINT     �   ALTER TABLE ONLY public.canciones
    ADD CONSTRAINT fkjj29ydwq328lf22r8sgthayfu FOREIGN KEY (artista_id) REFERENCES public.artistas(id);
 O   ALTER TABLE ONLY public.canciones DROP CONSTRAINT fkjj29ydwq328lf22r8sgthayfu;
       public          postgres    false    217    215    3180               �   x�=�A�0���=�	���$��M�Q�MZ]��K�t����Y�B-�ǑV�%�mΧ�c$\8�C�J?�n)�{����59��D�h5ׂKZ�q� v�
R
��Q�c�bQ
�<[ژ��j�C��ŊOhh!��tݹ�?��i���A����|2�w�B~��G6         |  x���Mo�8��ԯ`O=�a��G$q;)bF���m�H��ȿ���ݍ�t��U�gf��;T�ֹSZKǖ*ͅ��A�o�GÄ}��{D%W�Op�$���5���Dw�Dd�4���ڐ�S�2B豥8H�|��l����w��-%�^��Y'�[�;�םeI�g�B���I���;}/v:M��E��ѧZSᤖ��M�|��&ѐ-+�R�s��!��&iw|.ū4�]�b�P~ĦV���m͟�b+�g�J�
��jKh������+`Q�	(։�6{T�+����� �+��� 9%��F�)���F�@ؼrR���ҭU�P��W�_=։T7p��bf�B��=�2��w�.#�Qܽ��2�W	����.Hg�5��[*��7�L�T��A���_Qo���󅂍pC�mV;��<
�u.L�U)eFyR�<��5�����#��}�Ah~�jU��OD�S.�^�J�N>sR��d-nU�I�o����vnuF�}�ǲ�ӹt�R�ؓ��P��O�`���;~�W���$�¾�B�����g �Y�3�
h��5����}�m�,n)N)b�d���x��z�|<���oa/Cb�b6.㍛.C�Qҁ������t�n�Ӎt�\�&Z�t�A}�;l3Z���\��	���P����K��gߴ����\j>S�m3eO�:��Q�g/�֔����}#E��$�^O��M�+͂|6�@�uB�cp�g��������]d#�eQ���H�"��l����*K<k�RqZ��>�N��8g�g�!t��(� ��Y��cQ*��?�����E�ghBV[���_��/�/��gwN&���Ь�L��lMi �L�aW�5gX���X��?#�E��(�	��g�     