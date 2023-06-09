PGDMP     9                    {            practice    15.2    15.2 #               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16398    practice    DATABASE     |   CREATE DATABASE practice WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';
    DROP DATABASE practice;
                postgres    false            �            1259    16456    coaches    TABLE     n   CREATE TABLE public.coaches (
    id_coach integer NOT NULL,
    name text,
    email text,
    phone text
);
    DROP TABLE public.coaches;
       public         heap    postgres    false            �            1259    16455    coaches_id_coach_seq    SEQUENCE     �   CREATE SEQUENCE public.coaches_id_coach_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.coaches_id_coach_seq;
       public          postgres    false    221                       0    0    coaches_id_coach_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.coaches_id_coach_seq OWNED BY public.coaches.id_coach;
          public          postgres    false    220            �            1259    16416    groups    TABLE     P   CREATE TABLE public.groups (
    id_group integer NOT NULL,
    size integer
);
    DROP TABLE public.groups;
       public         heap    postgres    false            �            1259    16415    groups_idGroup_seq    SEQUENCE     �   CREATE SEQUENCE public."groups_idGroup_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public."groups_idGroup_seq";
       public          postgres    false    217                        0    0    groups_idGroup_seq    SEQUENCE OWNED BY     L   ALTER SEQUENCE public."groups_idGroup_seq" OWNED BY public.groups.id_group;
          public          postgres    false    216            �            1259    16447    lessons    TABLE     �   CREATE TABLE public.lessons (
    id_lesson integer NOT NULL,
    id_coach integer,
    id_group integer,
    date date,
    "time" text
);
    DROP TABLE public.lessons;
       public         heap    postgres    false            �            1259    16446    lessons_id_lesson_seq    SEQUENCE     �   CREATE SEQUENCE public.lessons_id_lesson_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.lessons_id_lesson_seq;
       public          postgres    false    219            !           0    0    lessons_id_lesson_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.lessons_id_lesson_seq OWNED BY public.lessons.id_lesson;
          public          postgres    false    218            �            1259    16406    students    TABLE     �   CREATE TABLE public.students (
    id_student integer NOT NULL,
    name text NOT NULL,
    email text NOT NULL,
    phone text NOT NULL,
    id_group integer
);
    DROP TABLE public.students;
       public         heap    postgres    false            �            1259    16413 	   my_serial    SEQUENCE     �   CREATE SEQUENCE public.my_serial
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.my_serial;
       public          postgres    false    214            "           0    0 	   my_serial    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.my_serial OWNED BY public.students.id_student;
          public          postgres    false    215            w           2604    16459    coaches id_coach    DEFAULT     t   ALTER TABLE ONLY public.coaches ALTER COLUMN id_coach SET DEFAULT nextval('public.coaches_id_coach_seq'::regclass);
 ?   ALTER TABLE public.coaches ALTER COLUMN id_coach DROP DEFAULT;
       public          postgres    false    221    220    221            u           2604    16419    groups id_group    DEFAULT     s   ALTER TABLE ONLY public.groups ALTER COLUMN id_group SET DEFAULT nextval('public."groups_idGroup_seq"'::regclass);
 >   ALTER TABLE public.groups ALTER COLUMN id_group DROP DEFAULT;
       public          postgres    false    216    217    217            v           2604    16450    lessons id_lesson    DEFAULT     v   ALTER TABLE ONLY public.lessons ALTER COLUMN id_lesson SET DEFAULT nextval('public.lessons_id_lesson_seq'::regclass);
 @   ALTER TABLE public.lessons ALTER COLUMN id_lesson DROP DEFAULT;
       public          postgres    false    218    219    219            t           2604    16422    students id_student    DEFAULT     l   ALTER TABLE ONLY public.students ALTER COLUMN id_student SET DEFAULT nextval('public.my_serial'::regclass);
 B   ALTER TABLE public.students ALTER COLUMN id_student DROP DEFAULT;
       public          postgres    false    215    214                      0    16456    coaches 
   TABLE DATA           ?   COPY public.coaches (id_coach, name, email, phone) FROM stdin;
    public          postgres    false    221   =%                 0    16416    groups 
   TABLE DATA           0   COPY public.groups (id_group, size) FROM stdin;
    public          postgres    false    217   �%                 0    16447    lessons 
   TABLE DATA           N   COPY public.lessons (id_lesson, id_coach, id_group, date, "time") FROM stdin;
    public          postgres    false    219   &                 0    16406    students 
   TABLE DATA           L   COPY public.students (id_student, name, email, phone, id_group) FROM stdin;
    public          postgres    false    214   �&       #           0    0    coaches_id_coach_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.coaches_id_coach_seq', 1, false);
          public          postgres    false    220            $           0    0    groups_idGroup_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public."groups_idGroup_seq"', 1, false);
          public          postgres    false    216            %           0    0    lessons_id_lesson_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.lessons_id_lesson_seq', 1, false);
          public          postgres    false    218            &           0    0 	   my_serial    SEQUENCE SET     7   SELECT pg_catalog.setval('public.my_serial', 2, true);
          public          postgres    false    215                       2606    16463    coaches coaches_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.coaches
    ADD CONSTRAINT coaches_pkey PRIMARY KEY (id_coach);
 >   ALTER TABLE ONLY public.coaches DROP CONSTRAINT coaches_pkey;
       public            postgres    false    221            {           2606    16421    groups groups_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.groups
    ADD CONSTRAINT groups_pkey PRIMARY KEY (id_group);
 <   ALTER TABLE ONLY public.groups DROP CONSTRAINT groups_pkey;
       public            postgres    false    217            }           2606    16454    lessons lessons_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.lessons
    ADD CONSTRAINT lessons_pkey PRIMARY KEY (id_lesson);
 >   ALTER TABLE ONLY public.lessons DROP CONSTRAINT lessons_pkey;
       public            postgres    false    219            y           2606    16424    students students_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.students
    ADD CONSTRAINT students_pkey PRIMARY KEY (id_student);
 @   ALTER TABLE ONLY public.students DROP CONSTRAINT students_pkey;
       public            postgres    false    214            �           2606    16464    lessons coachesFK    FK CONSTRAINT     �   ALTER TABLE ONLY public.lessons
    ADD CONSTRAINT "coachesFK" FOREIGN KEY (id_coach) REFERENCES public.coaches(id_coach) NOT VALID;
 =   ALTER TABLE ONLY public.lessons DROP CONSTRAINT "coachesFK";
       public          postgres    false    219    221    3199            �           2606    16437    students groupsFK    FK CONSTRAINT     �   ALTER TABLE ONLY public.students
    ADD CONSTRAINT "groupsFK" FOREIGN KEY (id_group) REFERENCES public.groups(id_group) NOT VALID;
 =   ALTER TABLE ONLY public.students DROP CONSTRAINT "groupsFK";
       public          postgres    false    217    3195    214            �           2606    16469    lessons groupsFK2    FK CONSTRAINT     �   ALTER TABLE ONLY public.lessons
    ADD CONSTRAINT "groupsFK2" FOREIGN KEY (id_group) REFERENCES public.groups(id_group) NOT VALID;
 =   ALTER TABLE ONLY public.lessons DROP CONSTRAINT "groupsFK2";
       public          postgres    false    3195    219    217               �   x�m�;�0D��)R��Fl��v 8 %��XJD#;D��w�ћ�hx�	�%/qr��}�X�-;��@LǊ�An��Pp�Ӑ��L��C*6�
����[�:��\����$Z)x��7w!�8���|�F
��~�6�*�F�}zs_��a�@T         !   x�3�44�2�44�2�A,SN#�=... ?O�         ^   x�UϹ�0�X�"���Z�>4
������0¢��2�I�`k�l`K<��WpcD_.���	������{����>�CD?v�%�           x�m��j�0�ϫ��(xeْnMO=Ev�X�~@�}�
�b.�vvf�q2)C�S^�d���3����Y4O�p��)r��08�:@�k�`m�70㒢��F:x3!��T���un����Z�"t����K]uC
>P�Q�'=�� ��L&<{IBO���N1����u1mPgA�P2+Wg䪧��-�f��"�$H$��C���h��y�F�a�L����_t:�w�T�(9�[C�����u����r���{B���v�     